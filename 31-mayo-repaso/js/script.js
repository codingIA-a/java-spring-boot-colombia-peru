function onclickButton(){
    alert("Esta alerta aparece luego de hacer click en el botón Alerta")
}

//event listener

const listenButton = document.getElementById("red-button")
function eventListener(){
    listenButton.style.backgroundColor = 'red'
}
listenButton.addEventListener("click", eventListener)