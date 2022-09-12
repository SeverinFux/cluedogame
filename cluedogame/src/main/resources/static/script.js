
alert("Severin");

function changeBackroundColor(id){

    console.log("Im Focused")
}
function soutData(data){
    console.log("Data: " + data);
}
function sendForm(form){
    console.log('sent form: ' + $(form).serialize());
    return false;
}
const sizes = ['XS', 'S', 'M', 'L', 'XL', 'XXL'];

// generate the radio groups
const group = document.querySelector("#group");
group.innerHTML = sizes.map((size) => `<div>
                <input type="radio" name="size" value="${size}" id="${size}">
                 <label for="${size}">${size}</label>
            </div>`).join(' ');

// add an event listener for the change event
const radioButtons = document.querySelectorAll('input[name="size"]');
for(const radioButton of radioButtons){
    radioButton.addEventListener('change', showSelected);
}

function showSelected(e) {
    console.log(e);
    if (this.checked) {
        document.querySelector('#output').innerText = `You selected ${this.value}`;
    }
}