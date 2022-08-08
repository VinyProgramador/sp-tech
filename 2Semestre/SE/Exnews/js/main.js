var ativa = document.getElementsByClassName("swiper-slide-active");

function mudarNoticias() {
    div01 = document.getElementById("01");
    div02 = document.getElementById("02");
    div03 = document.getElementById("03");
    div04 = document.getElementById("04");
    div05 = document.getElementById("05");
    div06 = document.getElementById("06");

    noticia03 = document.getElementById('noticiaIntegrantes');
    var noticia02 = document.getElementById('pontosBonsEruins')
    a = document.getElementsByClassName("parte1");



    var mudarParticipante = document.getElementById("parte3");

    if (ativa.item(0) == div01) {
        a.item(0).style.backgroundImage = 'url(img/logoAccenture.jpeg)'
        noticia03.innerHTML = `<p>Fui para empresa pela primeira vez, pegar os equipamentos, saindo da estação ja me deparei com ela, gigante e
        linda, porém, mal esperava o que estava por vir. Cheguei na recepção animado e peguei o crachá de visitante,
        quando fui passar pela catraca…. Parecia um enigma, fui de primeira, tentei passar mas a catraca nao rodava,
        tinha que aproximar o crachá.
        Fiquei observando… onde sera que encosto o crachá? Encostei em cima, esperei alguma resposta, não obtive,
        coloquei ao lado…. nada e novas pessoas apareciam pela recepção. A recepcionista vendo meu desespero,
        gentilmente disse: “É só aproximar ao lado”.
        Olhei pra ela, olhei pra catraca, olhei pro lado da catraca e pra ela de novo, aproximei o crachá e foi… Foi
        quase que eu consegui pois era o lado errado.
        Até que um salvador da pátria, funcionário da Accenture, surge e me auxilia no momento mais vergonhoso da
        semana. Sai rindo de alívio e agradecendo, tentando amenizar a vergonha passada </p>`
        mudarParticipante.innerHTML = "<img src='img/charles.jpg' id='imgParticipante'/>"
        noticia02.innerHTML = `<p> pontos bons da empresa: Super acolhedora, funcionários gentis, o local por dentro é lindo e mostra muita
        diversidade!
        <br><br>
        Pontos ruins: Muitos contratos pra assinar, e catracas um pouco complicadas.</p>`
    }
    else if (ativa.item(0) == div02) {
        a.item(0).style.backgroundImage = 'url(img/logoAccenture.jpeg)'
        noticia03.innerHTML = `<p>Do dia 9 ao dia 23 de julho, ocorreu a Missão Calebe no bairro do JD. Perequê. Nesta missão, ocorreram várias ações que beneficiaram a comunidade como um todo, desde visitas até uma feira de saúde que pôde ajudar a comunidade com doação de roupas, limpeza de pele, atendimento psicológico, aferição de pressão e nível de glicose no sangue, entre algumas outras coisas. Fora as ações feitas a favor da comunidade, a rotina dos calebes era muito descontraída e divertida, através da missão várias amizades foram feitas.</p>`
        mudarParticipante.innerHTML = "<img src='img/eu.jpg' id='imgParticipante'/>"
        noticia02.innerHTML = `<p> pontos bons da empresa: Super acolhedora, funcionários gentis, o local por dentro é lindo e mostra muita
        diversidade!
        <br><br>
        Pontos ruins: Muitos contratos pra assinar, e catracas um pouco complicadas.</p>`
    }
    else if (ativa.item(0) == div03) {
        a.item(0).style.backgroundImage = 'url(img/logoAccenture.jpeg)'
        noticia03.innerHTML = `<p>Estagiário decide jogar um campeonato com desenvolvedor sênior.<p>
        <p>Durante as férias sem fazer muita coisa o estagiário em questão decide ter a brilhante ideia de jogar um campeonato de league of legends com seu amigo que já era estagiário da accenture, seu amigo então chama seu gestor que por algum motivo joga lol com ele e ele aceita.
        Time formado então: estagiários, Desenvolvedor Sênior e amigos dele. Começamos a jogar e com isso estavam todos confiantes, quando fomos jogar de primeira ganhamos um jogo de W.O após um tempo esperando o próximo adversário fomos jogar o primeiro jogo e ganhamos, jogamos o segundo e também ganhamos. A partir desse momento pensamos o seguinte “só faltam 3 jogos para ganharmos o campeonato o que poderia dar errado” a recompensa estava quase em nossas mãos afinal e o problema estava ai.
        Quando você para pra pensar ganhamos dois jogos e um de W.O então já estávamos bem na frente no campeonato então em algum momento sabíamos que iriamos cair com pessoas que seriam um desafio, mas nunca imaginamos um desafio tão grande. Ao sair nosso quarto jogo olhamos para o time inimigo e nele estavam Streamers de elo Altíssimo no top do servidor brasileiro, os melhores dos melhores estavam contra nos.
        Ao começarmos a jogar eu o estagiário era o nível mais alto do time então se alguém fosse conseguir enfrenta-los acharam que seria eu mas infelizmente não consegui bater a expectativa que colocaram em mim. Após uma árdua partida que infelizmente acabou em menos de 12 minutos nos estamos derrotados e a pior parte eu tinha pensado que poderia fazer alguma coisa mas não fiz nada. Fomos derrotados por streamers mas afinal eles já tem os nome deles eles jogam bem já sabíamos disso mas não pensamos que perderíamos tão feio.
        Após a partida todos nos ficamos desanimados afinal uma derrota estando tão perto da vitória dói né e então todos saíram e não quiseram mais jogar. Outro dia jogamos partidas normais, ficamos em call batendo papo e tudo ficou normal já jogamos várias vezes agora e quem sabe algum dia jogamos outro campeonato, mas por enquanto sabemos apenas que não esqueceremos essa surra tão cedo. </p>`
        mudarParticipante.innerHTML = "<img src='img/brenão.jpg' id='imgParticipante'/>"
        noticia02.innerHTML = `<p>xpto</p>`
    }
    else if (ativa.item(0) == div04) {
        a.item(0).style.backgroundImage = 'url(img/logoDeloitte.jpeg)'
        mudarParticipante.innerHTML = "<img src='img/viniNunes.jpeg' id='imgParticipante'/>"
        noticia03.innerHTML = `<p>xpto</p>`
        noticia02.innerHTML = `<p>xpto</p>`
    }
    else if (ativa.item(0) == div05) {
        a.item(0).style.backgroundImage = 'url(img/logoAccenture.jpeg)'
        mudarParticipante.innerHTML = "<img src='img/vini-do-mangue.jpg' id='imgParticipante'/>"
        noticia03.innerHTML = `<p>No dia 24/06/2022 amigos se reunem para se despedir de amigo que foi convocado para a Policia do Exército Brasileiro</p>
        <p>Como foi algo que pegou todos de surpresa foi com certeza um dia em que eles tiveram muito o que conversar, mas eles não se despediram com um tom triste mas sim curtindo o máximo que eles podiam.</p>
        <p>Um dos amigos diz:”É sempre triste ter que ficar longe de um amigo mas pelo menos a gente sabe que não é pra sempre.”</p>`
        noticia02.innerHTML = `<p>xpto</p>`
    }
    else {
        a.item(0).style.backgroundImage = 'url(img/logoDeloitte.jpeg)'
        noticia02.innerHTML = `<p>ponto bom:
        O respeito e educação na contratação (ser bem recebido na equipe);
        Segurança com questões legais e dados sensíveis.
        <br><br>
        ponto ruim:
        Demora na contratação (contactar);
        muito processo envolvido, assim aumentando o tempo de contatos e finalização do contrato.</p>`
        noticia03.innerHTML = `'Universitário diz ser bem recebido'
        <br><br>
        Os primeiros contatos que tive com a Deloitte foi na contratação, assim já criando alguma imagem da mesma. De início a preocupação só aumentava, nada de qualquer tipo de contato, nem mesmo por e-mail. Na qual era a única opção que eu tinha acesso. Quando vieram me contatar, fui recebido e atendido da melhor forma. Mesmo pelas empresas terceiras que fizeram parte do processo, e analisando, todas as burocracias e a infraestrutura de uma única contratação, e o os respeito pela segurança e suporte ao colaborador da empresa. vendo o início, na parte da demora e ansiedade, estendido por terceiros com as documentações que parece não ter fim, nada passa de uma troca. Veem a segurança das informações e atentando de serem mais receptivos o possível com os contratados.`
        mudarParticipante.innerHTML = "<img src='img/tarifa.jpeg' id='imgParticipante'/>"
    }
}