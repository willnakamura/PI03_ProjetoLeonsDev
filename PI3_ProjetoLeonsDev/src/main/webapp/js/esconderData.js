

function ocultar(){

var x = document.getElementById("SoIda");

if(x.checked==1){
document.getElementById("SoIda").checked = true;
   
document.getElementById("ocultarData").setAttribute("type","hidden");
document.getElementById("datadevolta").setAttribute("type","hidden");

}
}

function mostrar(){
  
   document.getElementById("ocultarData").setAttribute("type","date");
    
}