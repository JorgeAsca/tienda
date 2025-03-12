document.addEventListener("DOMContentLoaded", function () {
    let navbar = document.querySelector(".navbar");
    let lastScrollY = window.scrollY;

    window.addEventListener("scroll", function () {
        if (window.scrollY > lastScrollY) {
            navbar.style.top = "-70px"; // Oculta la navbar
        } else {
            navbar.style.top = "0"; // Muestra la navbar
        }
        lastScrollY = window.scrollY;
    });
});
