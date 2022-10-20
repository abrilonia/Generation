
function duplicaMatriz(matriz1) {
   
    for (i=0; i<matriz1.length; i++){
        var elemento=matriz1[i];
        matriz1[i]=elemento*2;
    }
        console.log(matriz1);

}

duplicaMatriz([1,6,2]);


