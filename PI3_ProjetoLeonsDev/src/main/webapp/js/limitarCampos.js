window.addEventListener("load",limita);

function limita(numero){
    
  var max_numeros = 11;
  
  if(numero.value.length > max_numeros) {
      
    numero.value = numero.value.substr(0, max_numeros);
  }
}




