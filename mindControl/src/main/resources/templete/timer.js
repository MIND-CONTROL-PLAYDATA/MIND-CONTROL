let timerInterval;
let remainingSeconds = 180; // 3분을 초 단위로 표시

function updateTimer() {
  const minutes = Math.floor(remainingSeconds / 60);
  const seconds = remainingSeconds % 60;
  const formattedTime = `${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;
  document.getElementById('timer').textContent = formattedTime;

  remainingSeconds--;

  if (remainingSeconds < 0) {
    clearInterval(timerInterval);
    document.getElementById('startStopBtn').textContent = '시작';
  }
}

function startStopTimer() {
  if (!timerInterval) {
    timerInterval = setInterval(updateTimer, 1000);
    document.getElementById('startStopBtn').textContent = '정지';
  } else {
    clearInterval(timerInterval);
    timerInterval = null;
    document.getElementById('startStopBtn').textContent = '시작';
  }
}

function resetTimer() {
  clearInterval(timerInterval);
  remainingSeconds = 180;
  timerInterval = null;
  document.getElementById('timer').textContent = '03:00';
  document.getElementById('startStopBtn').textContent = '시작';
}

document.getElementById('startStopBtn').addEventListener('click', startStopTimer);
document.getElementById('resetBtn').addEventListener('click', resetTimer);
