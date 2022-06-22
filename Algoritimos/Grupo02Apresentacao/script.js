function mudarImagem() {
    imagemTroca.innerHTML = `<img src ="img/a-direita.png">`
    setTimeout(() => {
        Swal.fire('Continue com a pustura correta dev!!')
    }, '200');

}

function irParaResposta(){
    window.location='#';
}