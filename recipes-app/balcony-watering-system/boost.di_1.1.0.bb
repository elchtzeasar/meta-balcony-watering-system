DESCRIPTION = "BalconyWateringSystem application" 
SECTION = "examples" 
LICENSE = "BSL-1.0" 
PR = "r0" 

DEPENDS = ""

SRC_URI = "https://raw.githubusercontent.com/boost-experimental/di/cpp14/include/boost/di.hpp;md5sum=f33d1747c79e7f85aacdf899388d5d30 https://www.boost.org/LICENSE_1_0.txt;md5sum=e4224ccaecb14d942c71d31bef20d78c"

LIC_FILES_CHKSUM = "file://${WORKDIR}/di.hpp;beginline=1;endline=6;md5=520d57c6a5f8f2b80441e59ef1ae3b94"

do_install() {
  install -m 0755 -d ${D}/${includedir}/boost
  install -m 0644 ${WORKDIR}/di.hpp ${D}/${includedir}/boost/
}
