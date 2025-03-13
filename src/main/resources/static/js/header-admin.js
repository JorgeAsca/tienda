function toggleSidebar() {
    let sidebar = document.getElementById("sidebar");
    let overlay = document.getElementById("overlay");

    if (sidebar.style.transform === "translateX(-100%)") {
        sidebar.style.transform = "translateX(0)";
        overlay.style.display = "block"; // Muestra el overlay
    } else {
        sidebar.style.transform = "translateX(-100%)";
        overlay.style.display = "none"; // Oculta el overlay
    }
}

// Asegurar que el script se ejecuta cuando el DOM está cargado
document.addEventListener("DOMContentLoaded", function () {
    let menuButton = document.querySelector(".menu-toggle");
    let overlay = document.getElementById("overlay");

    if (menuButton) {
        menuButton.addEventListener("click", toggleSidebar);
    }

    if (overlay) {
        overlay.addEventListener("click", toggleSidebar);
    }
});