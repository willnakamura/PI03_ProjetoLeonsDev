

function ocultar(){

var x = document.getElementById("SoIda");

if(x.checked==1){
document.getElementById("SoIda").checked = true;   
document.getElementById("ocultarData").setAttribute("type","hidden");
document.getElementById("dataidavoo").style.width = "30%";
}
}

function mostrar(){
  
   document.getElementById("ocultarData").setAttribute("type","date");
   document.getElementById("dataidavoo").style.width = "100%";
   
}