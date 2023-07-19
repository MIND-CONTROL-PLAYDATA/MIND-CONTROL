document.getElementById('startBtn').addEventListener('click', function () {
  const users = document.getElementsByClassName('user');
  const userList = [];

  for (let i = 0; i < users.length; i++) {
    const userName = users[i].querySelector('.userName').value;
    const profileImg = users[i].querySelector('.profileImg').src;

    if (userName.trim() !== '' && profileImg !== '') {
      userList.push({ name: userName, profileImg: profileImg });
    }
  }

  if (userList.length >= 3) {
    setupGame(userList);
  } else {
    alert('err');
  }
});

function setupGame(userList) {
  const userCount = userList.length;
  const canvas = document.getElementById('canvas');
  const ctx = canvas.getContext('2d');
  let currentPlayerIndex = 0;
  const words = ['사과', '바나나', '귤', '딸기', '수박', '포도', '키위', '오렌지']; // 게임에 사용될 단어들

  // 게임 시작 화면 숨기고 게임 화면 표시
  document.getElementById('userList').style.display = 'none';
  document.getElementById('gameScreen').style.display = 'block';

  // 유저 리스트 화면에 표시
  const userListDiv = document.createElement('div');
  userListDiv.innerHTML = '<h2>참여한 유저 목록</h2>';
  userList.forEach((user) => {
    const userDiv = document.createElement('div');
    userDiv.classList.add('user');
    userDiv.innerHTML = `
      <img src="${user.profileImg}" alt="프로필 이미지" class="profileImg">
      <span>${user.name}</span>
    `;
    userListDiv.appendChild(userDiv);
  });
  document.body.appendChild(userListDiv);

  function drawWord() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.font = '30px Arial';
    ctx.fillText(words[Math.floor(Math.random() * words.length)], 150, 200);
  }

  drawWord();

  document.getElementById('guessBtn').addEventListener('click', function () {
    const userGuess = document.getElementById('guessInput').value;
    // 게임 로직 추가
  });
}
