
function esercizio1(){
    let a=2,b=3;
    console.log("Esercizio1");
    console.log("Soluzione somma "+a+"+"+b+": " +sommaDueNumeri(a,b));
    a=5,b=10;
    console.log("Soluzione somma "+a+"+"+b+": " +sommaDueNumeri(a,b));

}

function esercizio2(){
    let a=2,b=3;
    console.log("Esercizio2");
    console.log("Soluzione differenza "+a+"-"+b+": " +differenzaDueNumeri(a,b));
    a=5,b=10;
    console.log("Soluzione differenza "+a+"-"+b+": " +differenzaDueNumeri(a,b));

}

function esercizio3(){
    let a=2,b=3;
    console.log("Esercizio3");
    console.log("Soluzione moltplicazione "+a+"*"+b+": " +moltplicaDueNumeri(a,b));
    a=5,b=10;
    console.log("Soluzione moltplicazione "+a+"*"+b+": " +moltplicaDueNumeri(a,b));

}

function esercizio4(){
    let a=2,b=3;
    console.log("Esercizio4");
    console.log("Soluzione divisione "+a+"/"+b+": " +dividiDueNumeri(a,b));
    a=5,b=10;
    console.log("Soluzione divisione "+a+"/"+b+": " +dividiDueNumeri(a,b));
}

function esercizio5(){
    let a=6,b=3;
    console.log("Esercizio5");
    console.log("Il resto della divisione "+a+"/"+b+": " +restoDivisioneDueNumeri(a,b));
    a=10,b=8;
    console.log("Il resto della divisione "+a+"/"+b+": " +restoDivisioneDueNumeri(a,b));
}

function esercizio6(){
    const arr = [2,5,6,1,2,5,2];
    console.log("Esercizio6");
    console.log("La media aritmetica dei seguenti numeri: " +arr);
    console.log("e': "+calcolaMediaNumeri(arr));
    const arr2 = [10,16,30,20];
    console.log("La media aritmetica dei seguenti numeri: "+arr2);
    console.log("e': "+calcolaMediaNumeri(arr2));
}

function esercizio7(){
    let num=7;
    console.log("Esercizio7");
    console.log(`Il numero ${num} e' ${isEven(num)?"pari":"dispari"}`);
    num=10;
    console.log(`Il numero ${num} e' ${isEven(num)?"pari":"dispari"}`);
}

function esercizio8(){
    console.log("Esercizio8");
    let num1=7;
    let num2 =10;
    confrontaDueNumeri(num1,num2);
    num1=5;
    num2 =5;
    confrontaDueNumeri(num1,num2);
    num1 =12;
    num2=1;
    confrontaDueNumeri(num1,num2);
}

function esercizio9(){
    console.log("Esercizio9");
    let stringa = "";
    console.log("Prima stringa: "+stringa);
    if(isStringEmpty(stringa))
        console.log("La prima stringa e' vuota");
    else
        console.log("La prima stringa non e' vuota");

    let stringa2 = "ciao";
    console.log("Seconda stringa: "+stringa2);
    if(isStringEmpty(stringa2))
        console.log("La seconda stringa e' vuota");
    else
        console.log("La seconda stringa non e' vuota");

}

function esercizio10(){
    console.log("Esercizio10");
    let stringa = "Aereoplano";
    let sottostringa = "plan";
    console.log(`La stringa ${stringa} contiene la sottostringa ${sottostringa}?`);
    if(stringa.includes(sottostringa)) console.log("Si");
    else console.log("No");

    stringa = "Aereoplano";
    sottostringa = "ciao";
    console.log(`La stringa ${stringa} contiene la sottostringa ${sottostringa}?`);
    if(stringa.includes(sottostringa)) console.log("Si");
    else console.log("No");

}

function esercizio11(){
    console.log("Esercizio11");
    let carattere = 'b';
    console.log(`Il carattere ${carattere} ${isAVowel(carattere)? "e' una vocale": " e' una consonante"}`);

    carattere = 'o';
    console.log(`Il carattere ${carattere} ${isAVowel(carattere)? "e' una vocale": " e' una consonante"}`);
}


function esercizio12(){
    console.log("Esercizio12");
    const dividendo1 =3, dividendo2=5;
    let num=9;
    divisibilePerDueNumeri(num,dividendo1,dividendo2);
    num=10;
    divisibilePerDueNumeri(num,dividendo1,dividendo2);
    num=15;
    divisibilePerDueNumeri(num,dividendo1,dividendo2);
    num=7;
    divisibilePerDueNumeri(num,dividendo1,dividendo2);

}

function esercizio13(){
    console.log("Esercizio13");
    const arr1= [1,3,5,7];
    console.log("Primo array: "+arr1);
    const arr2= [10,15];
    console.log("Secondo array: "+arr2);
}

function esercizio14(){
    console.log("Esercizio14");
    const arr1= [1,3,5,7];
    console.log("Primo array: "+arr1);
    let elemento=5;
    if(arr1.includes(elemento))
        console.log(`L'elemento ${elemento} e' stato trovato nell'array`);
    else
        console.log(`L'elemento ${elemento} non e' stato trovato nell'array`);
    const arr2= [10,15];
    console.log("Secondo array: "+arr2);
    elemento=14;
    if(arr2.includes(elemento))
        console.log(`L'elemento ${elemento} e' stato trovato nell'array`);
    else
        console.log(`L'elemento ${elemento} non e' stato trovato nell'array`);
}

function esercizio15(){
    console.log("Esercizio15");
    const arr1= [1,3,5,7];
    console.log("Primo array: "+arr1);
    const arr2= [10,15];
    console.log("Secondo array: "+arr2);

    const unioneArray = [...arr1,...arr2];

    console.log("Array unione: "+unioneArray);
}

function esercizio16(){
    console.log("Esercizio16");
    const arr1= [1,2,3,4,5,6,7];
    console.log("Primo array: "+arr1);

    console.log("Array composto da solo i numeri pari del primo array: "+ottieniSoloNumeriPariArray(arr1));

    const arr2= [10,15,13,17,21,34];
    console.log("Secondo array: "+arr2);
    console.log("Array composto da solo i numeri pari del secondo array: "+ottieniSoloNumeriPariArray(arr2));

}

function esercizio17(){
    console.log("Esercizio17");
    const arr1= [1,2,3,4,5,6,7,8,9,10];
    console.log("Primo array: "+arr1);
    console.log("Elementi maggiori di 5 nell'array: "+arr1.filter((e)=>e>5));

    const arr2= [10,15,13,17,21,34,1,5,3,2];
    console.log("Secondo array: "+arr2);
    console.log("Elementi maggiori di 5 nell'array: "+arr2.filter((e)=>e>5));



}

function esercizio18(){
    console.log("Esercizio18");
    const persona ={
        firstName: "Mario",
        lastName: "Rossi",
        eta: 55
    };

    console.log(persona);
}

function esercizio19(){
    console.log("Esercizio19");
    const persona ={
        firstName: "Mario",
        lastName: "Rossi",
        eta: 55
    };

    console.log("Oggetto: ");
    console.log(persona);

    console.log(`Il cognome della persona e' ${persona.lastName}`);

}

function esercizio20(){
    console.log("Esercizio20");
    const persona ={
        firstName: "Mario",
        lastName: "Rossi",
        eta: 55
    };
    console.log("Oggetto: ");
    console.log(persona);
    console.log(`Il nome della persona prima della modifica  e' ${persona.firstName}`);

    persona.firstName="Luca";

    console.log("Oggetto: ");
    console.log(persona);
    console.log(`Il nome della persona dopo la modifica  e' ${persona.firstName}`);
}

function esercizio21(num1,num2){
    console.log("Esercizio21");
    console.log("Soluzione somma "+num1+"+"+num2+": " +sommaDueNumeri(num1,num2));
}

function esercizio22(num){
    console.log("Esercizio22");
    console.log("Doppio di "+num+": "+raddoppiaNumero(num));
}

function esercizio23(stringa){
    console.log("Esercizio23");
    console.log(`Lunghezza della stringa ${stringa}: ${getLunghezzaStringa(stringa)}`);
}

function getLunghezzaStringa(stringa){
    return stringa.length;
}

function raddoppiaNumero(num){
    return num*2;
}

function ottieniSoloNumeriPariArray(arr){
   return arr.filter((num) => num%2==0);
}




function divisibilePerDueNumeri(num,dividendo1,dividendo2){
    let flag=false;
    if(num%dividendo1===0){
        console.log(`${num} e' divisibile per ${dividendo1} `);
        flag=true;
    }
    if(num%dividendo2===0){
        console.log(`${num} e' divisibile per ${dividendo2} `);
        flag=true;
    }
    if(!flag){
        console.log(`${num} non e' divisibile per ${dividendo1} o per ${dividendo2} `);

    }
}

function isAVowel(carattere){
    const vowels = ['a','e','i','o','u'];
    return vowels.includes(carattere);

}

function isStringEmpty(stringa){
    return stringa.length==0;
}

function confrontaDueNumeri(num1,num2){
    if(num1>num2) console.log(`${num1} e' maggiore di ${num2}`);
    else if(num1<num2) console.log(`${num1} e' minore di ${num2}`);
    else console.log(`${num1} e ${num2} sono uguali`);
}


function isEven(num){
    return num%2==0;
}

function calcolaMediaNumeri(arr){

    let sum=0;
    for(let i =0; i<arr.length; i++){
        sum+=arr[i];
    }
    return sum/arr.length;
}


function restoDivisioneDueNumeri(a,b){
    return a%b;
}


function dividiDueNumeri(a,b){
    return a/b;
}

function sommaDueNumeri(a,b){
    return a+b;
}

function moltplicaDueNumeri(a,b){
    return a*b;
}


function differenzaDueNumeri(a,b){
    return a-b;
}

