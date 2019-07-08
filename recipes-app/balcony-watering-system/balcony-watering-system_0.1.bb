DESCRIPTION = "BalconyWateringSystem application" 
SECTION = "examples" 
LICENSE = "MIT" 
PR = "r0" 

DEPENDS = "ncurses libyaml boost.di"
RDEPENDS_${PN} = "ncurses libyaml"

SRC_URI = "git://github.com/elchtzeasar/balcony-watering-system.git;tag=v0.1.1"

LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=b9bd3b7c997488fd0195e0d786bff72b"

S = "${WORKDIR}/git"

inherit pkgconfig cmake
