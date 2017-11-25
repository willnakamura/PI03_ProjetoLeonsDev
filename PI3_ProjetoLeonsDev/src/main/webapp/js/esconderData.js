window.addEventListener("load",check);

function check(){
console.log("chegou aqui");



if(document.getElementById("#SoIda").checked===true){
console.log("chegou aqui2");
var datavoltavoo = document.getElementById(".datavoltavoo");
console.log("chegou aqui3");
datavoltavoo.setAttribute("type","hidden");
console.log("chegou aqui4");
ocultarData.appendChild("datavoltavoo");
console.log("chegou aqui");
}
}