window.addEventListener("load",limitaOitoDigitos);

function limitaOitoDigitos(numero){
   
  var max_numeros = 8;
  
  if(numero.value.length > max_numeros) {
      
    numero.value = numero.value.substr(0, max_numeros);
  }
}




