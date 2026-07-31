// Smooth scrolling

document.querySelectorAll("nav a").forEach(link => {

    link.addEventListener("click", function(e){

        e.preventDefault();

        document.querySelector(
            this.getAttribute("href")
        ).scrollIntoView({
            behavior:"smooth"
        });

    });

});


// Welcome message

window.onload = function(){

    console.log("Portfolio Website Loaded Successfully");

};