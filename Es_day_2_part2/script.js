
function cambiaContenutoParagrafo(){
    const paragrafo = document.getElementById("saluto");
    paragrafo.innerText = "mondo";
}

function cambiaContenutoTabella(){
    const celle = document.getElementsByClassName("cell");
    for(let cell of celle){
        cell.innerText="a";
    }
}

function caricaMeme(){
    const memeImg = document.getElementById("meme");
    memeImg.src="https://www.dire.it/wp-content/uploads/2022/11/dawson-meme-1024x699.webp";
}


function go(){
    const urls = [
        "https://i.imgflip.com/7p0gko.jpg",
        "https://i.imgflip.com/7p1d2q.jpg",
        "https://i.imgflip.com/7p0fmp.jpg",
        "https://i.imgflip.com/7oxftb.jpg",
        "https://i.imgflip.com/7p495j.jpg",
        "https://i.imgflip.com/7o2w3k.jpg",
        "https://i.imgflip.com/7oxg1b.jpg",
        "https://i.imgflip.com/7oyvec.jpg",
        "https://i.imgflip.com/7ozfix.jpg"
    ];

    const images = document.getElementsByTagName("img");

        for(let i=0;i<urls.length;i++){
            images[i].src=urls[i];
        }
}