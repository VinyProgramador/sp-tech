var ativa = document.getElementsByClassName("swiper-slide-active");

function mudarNoticias(){
    div01 = document.getElementById("01");
    div02 = document.getElementById("02");
    div03 = document.getElementById("03");
    div04 = document.getElementById("04");
    div05 = document.getElementById("05");
    div06 = document.getElementById("06");

    a = document.getElementsByClassName("parte1")

    if(ativa.item(0) == div01 ){
        a.item(0).style.backgroundImage='url(img/logoAccenture.jpeg)'
    }
    else if(ativa.item(0) == div02){
        a.item(0).style.backgroundImage='url(img/logoAccenture.jpeg)'
    }
    else if(ativa.item(0) == div03){
        a.item(0).style.backgroundImage='url(img/logoAccenture.jpeg)'
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