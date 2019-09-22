IMAGE_INSTALL += " balcony-watering-system openssh i2c-tools kernel-modules"

# NOTE: This actually needs to be set in local.conf:
KERNEL_MODULE_AUTOLOAD += "i2c-dev"
