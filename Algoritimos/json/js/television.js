var controle = {
    marca:'Philips',
    tamanho:15,
    alterarVolume: function (botao) {
        if (botao == '+') {
            if(televisao.volume == 100) {
                console.log('Volume máximo!!')
                alert('Volume ja está no máximo!!');
            }else {
                televisao.volume++
                console.log(televisao.volume)
                volumeTv.innerHTML=`${televisao.volume}`
            }
        } 
        else if(botao == '-'){
            if(televisao.volume == 0) {
                console.log('Volume ja está no mínimo!!');
                alert('Volume ja está no mínimo!!');
            }else {
                televisao.volume--
                console.log(televisao.volume)
                volumeTv.innerHTML=`${televisao.volume}`

            }
        }
        else {
            console.log('Botão errado!')
        }
    },
    alterarCanal: function (numero) {
        if(numero == 4) {
            televisao.canal = 4;
            tv.innerHTML = '<img src="img/sbt.webp" alt="">'
        }
        else if(numero == 5) {
            televisao.canal = 5;
            tv.innerHTML = `<img src="img/globo.jpg" alt="">`
        }
        else if(numero == 7) {
            televisao.canal = 7;
            tv.innerHTML = `<img src="img/record.jfif" alt="">`
        }
        else if(numero == 13) {
            televisao.canal = 13;
            tv.innerHTML = `<img src="img/band.webp" alt="">`
        }
    }
}
var televisao={
    marca:'Philips',
    polegadas:42,
    smart:true,
    cor:'Cinza',
    volume:50,
    canal: 0
}