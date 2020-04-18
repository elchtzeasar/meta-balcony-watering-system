FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
     file://eth.network \
     file://en.network \
     file://wlan.network \
     \
     file://balcony-watering-system.service \
     file://i2c.rules \
"

FILES_${PN} += "\
     ${sysconfdir}/systemd/network/eth.network \
     ${sysconfdir}/systemd/network/en.network \
     ${sysconfdir}/systemd/network/wlan.network \
     \
     ${systemd_system_unitdir}/balcony-watering-system.service \
     ${sysconfdir}/systemd/system/multi-user.target.wants/balcony-watering-system.service \
     /etc/udev/rules.d/99-i2c.rules \
"

do_install_append() {
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/eth.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/en.network ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/wlan.network ${D}${sysconfdir}/systemd/network

    install -d ${D}${systemd_system_unitdir}
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
    install -m 0644 ${WORKDIR}/balcony-watering-system.service ${D}${systemd_system_unitdir}/
    ln -s ${systemd_system_unitdir}/balcony-watering-system.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/

    install -d ${D}/etc/udev/rules.d/99-i2c.rules
    install -m 0644 ${WORKDIR}/i2c.rules ${D}/etc/udev/rules.d/99-i2c.rules
}
