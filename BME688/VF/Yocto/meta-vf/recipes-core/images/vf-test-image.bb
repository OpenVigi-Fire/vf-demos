# Base this image on core-image-minimal
include recipes-core/images/core-image-base.bb

IMAGE_INSTALL += "i2c-tools wiringpi python3-dev kernel-module-i2c-dev kernel-module-i2c-bcm2708i curl"

DISTRO_FEATURES_append = " wifi"
