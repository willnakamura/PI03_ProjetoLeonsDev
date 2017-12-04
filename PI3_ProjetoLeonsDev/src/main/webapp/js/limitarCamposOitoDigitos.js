window.addEventListener("load",limita);

function limitaOitoDigitos(numero){
    console.log("chegou aqui1");
  var max_numeros = 8;
  console.log("chegou aqui2");
  if(numero.value.length > max_numeros) {
      console.log("chegou aqui3");
    numero.value = numero.value.substr(0, max_numeros);
  }
}




