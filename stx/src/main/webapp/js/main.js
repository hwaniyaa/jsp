Splitting();
//x,y,z
//transfotm:translateX()

const btnAuto = document.querySelector(".btn--auto");
const gnb = document.querySelector(".gnb");
const header = document.querySelector(".header");

// 서브메뉴
gnb.addEventListener("mouseenter", function () {
  header.classList.add("on");
});
gnb.addEventListener("mouseleave", function () {
  header.classList.remove("on");
});

// 동영상 온 오프 / 클래스 생성 온 오프
btnAuto.addEventListener("click", function () {
  if (mainVisualSwiper.autoplay.paused) {
    mainVisualSwiper.autoplay.run();
    btnAuto.classList.remove("off");
  } else {
    mainVisualSwiper.autoplay.pause();
    btnAuto.classList.add("off");
  }
});

gsap.from(".main-visual__txt .char", { opacity: 0, y: 100, duration: 1, stagger: 0.02, ease: "power4" });
const mainVisualSwiper = new Swiper(".main-visual", {
  loop: true,
  speed: 1000,
  autoplay: {
    delay: 2000,
    disableOnInteraction: false,
  },
  pagination: {
    el: ".main-visual .pagination .pagination-box",
    type: "bullets",
    clickable: true,
  },
});
