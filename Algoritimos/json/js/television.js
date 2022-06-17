var controle = {
    marca:'Philips',
    tamanho:15,
    alterarVolume: function (botao) {
        if (botao=='+') {
            if(televisao.volume == 100) {
                console.log('Volume máximo!!')
            }else {
                televisao.volume++
                console.log(televisao.volume)
            }
        } 
        else if(botao=='-'){
            if(televisao.volume == 0) {
                console.log('Volume ja está no mínimo!!')
            }else {
                televisao.volume--
                console.log(televisao.volume)
            }
        }
        else {
            console.log('Botão errado!')
        }
    }
}
var televisao={
    marca:'Philips',
    polegadas:42,
    smart:true,
    cor:'Cinza',
    volume:10
}