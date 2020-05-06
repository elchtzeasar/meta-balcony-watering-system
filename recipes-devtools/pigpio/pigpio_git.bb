DESCRIPTION = "a C library for the Raspberry which allows control of the GPIO"
SECTION = "devel/libs" 
LICENSE = "LGPLv3+" 
LIC_FILES_CHKSUM = "file://UNLICENCE;md5=61287f92700ec1bdf13bc86d8228cd13"

#DEPENDS = ""
#RDEPENDS_${PN} = "ncurses libyaml nativesdk-bcm2835 nativesdk-bcm2835-dev"

FILES_${PN}-doc += "/usr/man/man1/* /usr/man/man3/*"
FILES_${PN}-dev = "${includedir}"
FILES_${PN} += "${libdir}/*.so"

# tag v71
#SRCREV = "ad89f458c80a4f1629d100c99d2342db41e490fc"

#SRC_URI = "git://github.com/joan2937/pigpio.git"
#SRC_URI[sha256sum] = "d3a465c27e551001265df3ae3804b70194efd1c51438b8288ff664b001cd8f0f"

SRCREV = "ee7a6be22706238aa4efe214206128d3ce0bebc4"
SRC_URI = "git://github.com/myestro/pigpio.git;branch=fix-cmake-setup-for-yocto"

#COMPATIBLE_MACHINE = "^rpi$"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

do_install_append() {
    rm -rf ${D}/usr/lib/cmake
}