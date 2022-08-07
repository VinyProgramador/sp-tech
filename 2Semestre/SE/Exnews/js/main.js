var ativa = document.getElementsByClassName("swiper-slide-active");

function mudarNoticias(){
    div01 = document.getElementById("01");
    div02 = document.getElementById("02");
    div03 = document.getElementById("03");
    div04 = document.getElementById("04");
    div05 = document.getElementById("05");
    div06 = document.getElementById("06");

    noticia03 = document.getElementById('noticiaIntegrantes');

    a = document.getElementsByClassName("parte1")
    var mudarParticipante = imgParticipante.value

    if(ativa.item(0) == div01 ){
        a.item(0).style.backgroundImage='url(img/logoAccenture.jpeg)'
    }
    else if(ativa.item(0) == div02){
        a.item(0).style.backgroundImage='url(img/logoAccenture.jpeg)'
    }
    else if(ativa.item(0) == div03){
        a.item(0).style.backgroundImage='url(img/logoAccenture.jpeg)'
        noticia03.innerHTML=`<p>Estagiário decide jogar um campeonato com desenvolvedor sênior
        Durante as férias sem fazer muita coisa o estagiário em questão decide ter a brilhante ideia de jogar um campeonato de league of legends com seu amigo que já era estagiário da accenture, seu amigo então chama seu gestor que por algum motivo joga lol com ele e ele aceita.
        Time formado então: estagiários, Desenvolvedor Sênior e amigos dele. Começamos a jogar e com isso estavam todos confiantes, quando fomos jogar de primeira ganhamos um jogo de W.O após um tempo esperando o próximo adversário fomos jogar o primeiro jogo e ganhamos, jogamos o segundo e também ganhamos. A partir desse momento pensamos o seguinte “só faltam 3 jogos para ganharmos o campeonato o que poderia dar errado” a recompensa estava quase em nossas mãos afinal e o problema estava ai.
        Quando você para pra pensar ganhamos dois jogos e um de W.O então já estávamos bem na frente no campeonato então em algum momento sabíamos que iriamos cair com pessoas que seriam um desafio, mas nunca imaginamos um desafio tão grande. Ao sair nosso quarto jogo olhamos para o time inimigo e nele estavam Streamers de elo Altíssimo no top do servidor brasileiro, os melhores dos melhores estavam contra nos.
        Ao começarmos a jogar eu o estagiário era o nível mais alto do time então se alguém fosse conseguir enfrenta-los acharam que seria eu mas infelizmente não consegui bater a expectativa que colocaram em mim. Após uma árdua partida que infelizmente acabou em menos de 12 minutos nos estamos derrotados e a pior parte eu tinha pensado que poderia fazer alguma coisa mas não fiz nada. Fomos derrotados por streamers mas afinal eles já tem os nome deles eles jogam bem já sabíamos disso mas não pensamos que perderíamos tão feio.
        Após a partida todos nos ficamos desanimados afinal uma derrota estando tão perto da vitória dói né e então todos saíram e não quiseram mais jogar. Outro dia jogamos partidas normais, ficamos em call batendo papo e tudo ficou normal já jogamos várias vezes agora e quem sabe algum dia jogamos outro campeonato, mas por enquanto sabemos apenas que não esqueceremos essa surra tão cedo. </p>`
        mudarParticipante.innerHTML='<img id="imgParticipante" src="img/Breno.jpeg" alt="">'
        
    }
    else if(ativa.item(0) == div04){
        a.item(0).style.backgroundImage='url(img/logoDeloitte.jpeg)'
    }
    else if(ativa.item(0) == div05){
        a.item(0).style.backgroundImage='url(img/logoAccenture.jpeg)'
    }
    else{
        a.item(0).style.backgroundImage='url(img/logoDeloitte.jpeg)'
    }
}