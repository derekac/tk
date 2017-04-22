/**
 * Created by jason on 16/4/23.
 */
function changeDefaultImg() {
    var defaultvalue = document.getElementById("defaultvalue");
    if (defaultvalue.value == '0') {
        defaultvalue.value = '1';
        document.getElementById("defaulticon").src = "../img/useicon.png";
    } else {
        defaultvalue.value = '0';
        document.getElementById("defaulticon").src = "../img/unuseicon.png";
    }
}