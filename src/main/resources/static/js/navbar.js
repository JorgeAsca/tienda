document.addEventListener("DOMContentLoaded", function () {
    let prevScrollPos = window.pageYOffset;

    window.addEventListener("scroll", function () {
        let currentScrollPos = window.pageYOffset;
        let navbar = document.getElementById("navbar");

        if (prevScrollPos > currentScrollPos) {
            navbar.style.top = "0"; // Muestra la navbar
        } else {
            navbar.style.top = "-60px"; // Oculta la navbar 
        }
        prevScrollPos = currentScrollPos;
    });
});

// footer js para mostrar el footer cuando se llega al final de la página

document.addEventListener("DOMContentLoaded", function () {
    let footer = document.querySelector("footer");

    function checkScroll() {
        let footerPosition = footer.getBoundingClientRect().top;
        let screenHeight = window.innerHeight;

        if (footerPosition < screenHeight) {
            footer.classList.add("show-footer");
        }
    }

    window.addEventListener("scroll", checkScroll);
    checkScroll(); // Para verificar si ya está visible al cargar la página
});

function startCountdown(targetDate) {
    function updateCountdown() {
        const now = new Date().getTime();
        const distance = targetDate - now;

        if (distance < 0) {
            document.getElementById("countdown").innerHTML = "¡Tiempo agotado!";
            return;
        }

        const hours = Math.floor((distance / (1000 * 60 * 60)) % 24);
        const minutes = Math.floor((distance / (1000 * 60)) % 60);
        const seconds = Math.floor((distance / 1000) % 60);

        document.getElementById("hours").textContent = String(hours).padStart(2, '0');
        document.getElementById("minutes").textContent = String(minutes).padStart(2, '0');
        document.getElementById("seconds").textContent = String(seconds).padStart(2, '0');
    }

    updateCountdown(); // Llamar una vez para evitar parpadeo
    setInterval(updateCountdown, 1000);
}

// Fecha objetivo (personaliza la fecha)
const targetTime = new Date("2025-03-12T19:00:00").getTime();
startCountdown(targetTime);

