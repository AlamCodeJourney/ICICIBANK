document.addEventListener("DOMContentLoaded", function() {
    const firecracker = document.getElementById("firecracker");

    function createSpark() {
        const spark = document.createElement("span");
        spark.classList.add("spark");
        firecracker.appendChild(spark);

        const x = Math.random() * window.innerWidth;
        const y = Math.random() * window.innerHeight;
        const size = Math.random() * 30;
        const color = `hsl(${Math.random() * 360}, 100%, 50%)`;

        spark.style.left = x + "px";
        spark.style.top = y + "px";
        spark.style.width = size + "px";
        spark.style.height = size + "px";
        spark.style.background = color;

        setTimeout(() => {
            spark.remove();
        }, 1500);
    }

    function explode() {
        for (let i = 0; i < 50; i++) {
            createSpark();
        }
    }

    explode();
});
