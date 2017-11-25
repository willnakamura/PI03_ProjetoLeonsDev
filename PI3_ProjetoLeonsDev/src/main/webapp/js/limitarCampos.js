window.addEventListener("load",limite);

function limite(){

    var el = document.querySelector("dataCadsClient");
    el.addEventListener('keyup', function(event){
        var input = event.target;
        var toStr = String(input.value);
        if(input.value.length > 3){
            var novo = toStr.slice(0, limit);
            input.value = parseInt(novo);
        }
    });

}


