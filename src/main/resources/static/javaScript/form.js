const BmarcarCheckboxes = document.getElementById("BmarcarCheckboxes");
const BmarcarSelectMultiple = document.getElementById("BmarcarSelectMultiple");
const BdesmarcarTodo = document.getElementById("BdesmarcarTodo");

BmarcarCheckboxes.addEventListener("click",marcarCheckboxes);
BdesmarcarTodo.addEventListener("click", desmarcarTodo);
BmarcarSelectMultiple.addEventListener("click",marcarSelectMultiple);


function marcarCheckboxes() {
    var checkboxes = document.querySelectorAll('input[type="checkbox"]');
    checkboxes.forEach(function(checkbox) {
        checkbox.checked = true;});
}

function marcarSelectMultiple() {
    var selectMultiple = document.getElementById('musicas');
    var options = selectMultiple.options;
    for (var i = 0; i < options.length; i++) {
        options[i].selected = true;}
}

function desmarcarTodo() {
    var checkboxes = document.querySelectorAll('input[type="checkbox"]');
    checkboxes.forEach(function(checkbox) {
        checkbox.checked = false;});

    var selectMultiple = document.getElementById('musicas');
    var options = selectMultiple.options;
    for (var i = 0; i < options.length; i++) {
        options[i].selected = false;}
}
