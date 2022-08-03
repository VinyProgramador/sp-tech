
function acao() {

    //MODAL 
    let modal = document.querySelector('.modal')

    modal.style.display = 'block';


    var decimal = Number(numeroEscolhido.value);

    let octal = decimal.toString(8);

    let hexadecimal = decimal.toString(16);

    let binaria = decimal.toString(2);




    resultadodaConversao.innerHTML = `<br><br><br><br><br>Decimal:
    <span style="color:black">${decimal}</span>,
    Octal: <span style="color:black">${octal}</span>,
    Hexadecimal: <span style="color:black">${hexadecimal}</span>,
    Binario: <span style="color:black">${binaria}</span>.<br><br>
    O conversor te traz todas as Bases.`

}
// Fechar modal
function fechar() {

    let modal = document.querySelector('.modal')

    modal.style.display = 'none';
}