DESCRIPTION = "BalconyWateringSystem application" 
SECTION = "examples" 
LICENSE = "MIT" 
PR = "r0" 

DEPENDS = "ncurses libyaml boost.di pigpio"
RDEPENDS_${PN} = "ncurses libyaml"

SRC_URI = "git://github.com/elchtzeasar/balcony-watering-system.git;tag=v0.4.2"

LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=b9bd3b7c997488fd0195e0d786bff72b"

S = "${WORKDIR}/git"

inherit pkgconfig cmake

do_install_append() {
  install -d ${D}${sysconfdir}/
  install -m 0755 ${WORKDIR}/git/config.yaml ${D}${sysconfdir}/balcony-watering-system.yaml
}
