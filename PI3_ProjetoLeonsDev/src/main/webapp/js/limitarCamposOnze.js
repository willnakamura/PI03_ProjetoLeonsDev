window.addEventListener("load",limitaOnzeDigitos);

function limitaOnzeDigitos(numero){
    
  var max_numeros = 15;
  
  if(numero.value.length > max_numeros) {
    
    numero.value = numero.value.substr(0, max_numeros);
  }
  
}




