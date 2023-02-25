let x,y,r;
let checkedX=false;
let checkedY=false;
let checkedR=false

function submitData() {
    console.log("Submitting data...")

    let xRadio = document.getElementsByName("X");
    let yText = document.getElementById("Y").value;
    let rRadio = document.getElementsByName("R");

    dataCheck(xRadio,yText,rRadio)

    document.getElementById("hiddenForm").submit();

    console.log("Data submitted.");
}

function dataCheck(xRadio,yText,rRadio) {

    console.log("Checking data...")

    getX(xRadio);
    getY(yText);
    getR(rRadio);

    if (checkedX || checkedY || checkedR) {
        setHiddenForm(x,y,r);
        console.log("Setting data: x=" + x + ", y=" + y + ", r=" + r);
    }
}

function getX(radio) {
    for (let i = 0; i < radio.length; i++) {
        if (radio[i].checked) {
            x = radio[i].value;
            checkedX = true;
        }
    }
    if (checkedX === false) {
        document.getElementById("errorX").innerText = "Error: X can not be null!"
    }

    return false;
}

function getY(Text) {
    if (Text === "" || Text === null || isNaN(Text)) {
        document.getElementById("errorY").innerText = "Error: Y can not be null!"
        return false;
    } else {
        if (Text < -5 || Text > 5){
            document.getElementById("errorY").innerText = "Error: Y out of range!"
            return false;
        } else {
            y = Text;
        }
    }
}

function getR(radio) {
    for (let i = 0; i < radio.length; i++) {
        if (radio[i].checked) {
            r =  radio[i].value;
            checkedR = true;
        }
    }
    if (checkedR === false) {
        document.getElementById("errorX").innerText = "Error: X can not be null!"
    }

    return false;
}

function setHiddenForm(x,y,r) {
    //x_hidden_id.value = x;
    //y_hidden_id.value = y;
    //r_hidden_id.value = r;

    document.getElementById("x_hidden_id").value = x;
    document.getElementById("y_hidden_id").value = y;
    document.getElementById("r_hidden_id").value = r;
}