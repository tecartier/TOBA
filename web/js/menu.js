var menuButton  = document.getElementById('menuButton');
var menu        = document.getElementById('menu');
console.log(menuButton);

menuButton.addEventListener('click', function(){
     if(menu.classList.contains('active')) {
         menu.classList.remove('active');
     } else {
         menu.classList.add('active');
     }
});