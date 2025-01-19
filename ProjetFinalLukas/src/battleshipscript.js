// script.js
document.addEventListener("DOMContentLoaded", () => {
    const startButton = document.getElementById("start-game");
    const restartButton = document.getElementById("restart-game");
    const gameBoard = document.getElementById("game-board");
    const gameOver = document.getElementById("game-over");
    const gameMessage = document.getElementById("game-message");
    const playAgainButton = document.getElementById("play-again");
  
    let board = [];
    let ships = [];
    let hits = 0;
    const totalShips = 5;
    const shipLengths = [5, 4, 3, 3, 2]; // Original Battleship ship lengths
  
    function createBoard() {
      board = [];
      gameBoard.innerHTML = "";
      for (let i = 0; i < 10; i++) {
        const row = [];
        for (let j = 0; j < 10; j++) {
          const button = document.createElement("button");
          button.classList.add("cell");
          button.dataset.row = i;
          button.dataset.col = j;
          button.addEventListener("click", () => handleCellClick(i, j));
          gameBoard.appendChild(button);
          row.push({ hasShip: false, hit: false });
        }
        board.push(row);
      }
    }
  
    function placeShips() {
      ships = [];
      shipLengths.forEach((length) => {
        let placed = false;
        while (!placed) {
          const isHorizontal = Math.random() < 0.5;
          const row = Math.floor(Math.random() * 10);
          const col = Math.floor(Math.random() * 10);
  
          if (canPlaceShip(row, col, length, isHorizontal)) {
            placeShip(row, col, length, isHorizontal);
            ships.push({ row, col, length, isHorizontal });
            placed = true;
          }
        }
      });
    }
  
    function canPlaceShip(row, col, length, isHorizontal) {
        for (let i = 0; i < length; i++) {
          const r = row + (isHorizontal ? 0 : i);
          const c = col + (isHorizontal ? i : 0);
      
          // Check if the ship goes out of bounds
          if (r >= 10 || c >= 10 || board[r][c].hasShip) return false;
      
          // Check surrounding cells to ensure no adjacent ships
          for (let dr = -1; dr <= 1; dr++) {
            for (let dc = -1; dc <= 1; dc++) {
              const nr = r + dr;
              const nc = c + dc;
      
              if (nr >= 0 && nr < 10 && nc >= 0 && nc < 10) {
                if (board[nr][nc].hasShip) return false;
              }
            }
          }
        }
        return true;
      }
      
  
    function placeShip(row, col, length, isHorizontal) {
      for (let i = 0; i < length; i++) {
        const r = row + (isHorizontal ? 0 : i);
        const c = col + (isHorizontal ? i : 0);
        board[r][c].hasShip = true;
      }
    }
  
    function handleCellClick(row, col) {
      if (board[row][col].hit) return; // Prevent double-clicks
      board[row][col].hit = true;
      const cell = document.querySelector(
        `.cell[data-row="${row}"][data-col="${col}"]`
      );
  
      if (board[row][col].hasShip) {
        cell.classList.add("hit");
        hits++;
  
        // Check if the ship is sunk
        const sunkShip = checkIfShipSunk(row, col);
        if (sunkShip) {
          markSurroundingSquares(sunkShip);
        }
  
        if (hits === shipLengths.reduce((a, b) => a + b, 0)) {
          endGame(true);
        }
      } else {
        cell.classList.add("miss");
      }
    }
  
    function checkIfShipSunk(row, col) {
      // Identify the ship that contains the hit cell
      for (let ship of ships) {
        let { row: shipRow, col: shipCol, length, isHorizontal } = ship;
        let shipCells = [];
        for (let i = 0; i < length; i++) {
          const r = shipRow + (isHorizontal ? 0 : i);
          const c = shipCol + (isHorizontal ? i : 0);
          shipCells.push({ row: r, col: c });
        }
  
        // Check if all parts of the ship are hit
        if (shipCells.some(cell => cell.row === row && cell.col === col)) {
          const isSunk = shipCells.every(
            cell => board[cell.row][cell.col].hit
          );
          if (isSunk) return ship;
        }
      }
      return null;
    }
  
    function markSurroundingSquares(ship) {
      const { row: shipRow, col: shipCol, length, isHorizontal } = ship;
  
      // Loop through all squares surrounding the ship
      for (let i = -1; i <= length; i++) {
        for (let j = -1; j <= 1; j++) {
          const r = shipRow + (isHorizontal ? j : i);
          const c = shipCol + (isHorizontal ? i : j);
  
          // Ensure within bounds and not part of the ship
          if (
            r >= 0 &&
            r < 10 &&
            c >= 0 &&
            c < 10 &&
            !board[r][c].hasShip &&
            !board[r][c].hit
          ) {
            board[r][c].hit = true;
            const cell = document.querySelector(
              `.cell[data-row="${r}"][data-col="${c}"]`
            );
            cell.classList.add("miss");
          }
        }
      }
    }
  
    function endGame(won) {
      gameOver.style.display = "block";
      gameMessage.textContent = won ? "You Win!" : "Game Over!";
    }
  
    function startGame() {
      startButton.style.display = "none";
      restartButton.style.display = "inline-block";
      gameBoard.style.display = "grid";
      gameOver.style.display = "none";
      hits = 0;
      createBoard();
      placeShips();
    }
  
    startButton.addEventListener("click", startGame);
    restartButton.addEventListener("click", startGame);
    playAgainButton.addEventListener("click", startGame);
  });
  