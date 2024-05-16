function redAlert(){
    alert('Alerta roja!')
}
function blueAlert(){
    alert('Alerta Azul!')
}

const yellowButton = document.querySelector("#id-yellow")
function yellowOver(){
    yellowButton.style.backgroundColor = 'yellow'
}
function yellowOut(){
    yellowButton.style.backgroundColor = 'whitesmoke'
}
const purpleButton = document.querySelector("#id-purple")
function purpleAlert(){
    purpleButton.style.backgroundColor = 'purple'
}

const greenButton = document.querySelector("#id-green")
function textButton(){
    greenButton.innerText = 'green'
    greenButton.style.backgroundColor = 'green'
}
//Variables
const numUno = document.getElementById("id-uno")
const numDos = document.querySelector('#id-dos')
const numTres = document.querySelector("#id-tres")
//cambiar uno
function cambiarUno(){
    numUno.style.backgroundColor = "cyan"
    numUno.style.color = 'black'
}
numUno.addEventListener("click", cambiarUno);

//cambiar dos
function cambiarNum2(){
    numDos.style.backgroundColor = 'black';
    numDos.style.color = 'white'
}
numDos.addEventListener("mouseover", cambiarNum2);
//cambiar 3
numTres.addEventListener("mouseout", function(){

    numTres.style.backgroundColor = "yellowgreen";
})