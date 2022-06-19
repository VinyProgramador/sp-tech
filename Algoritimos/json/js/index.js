function enviarDados() {
    var marcaEscolhida = marca.value;
    marcaTxt.innerHTML=`${marcaEscolhida}`;
    
    var numUser = Math.floor(Math.random() * 101);
    localStorage.setItem(`Usuario${numUser}`,marcaEscolhida)

    const popUp = document.querySelector('.mensage');
    popUp.style.display='flex';

    setTimeout(() => {
        window.location = 'television.html';
    }, '1000');
}