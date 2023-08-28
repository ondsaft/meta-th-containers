SUMMARY = "TBD"
DESCRIPTION = "TBD"
LICENSE = "MIT"

IMAGE_FSTYPES = "container oci"
inherit image
inherit image-oci

IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""
NO_RECOMMENDATIONS = "1"

IMAGE_INSTALL = " \
    base-files \
    base-passwd \
    netbase \
    ${CONTAINER_SHELL} \
 "

CONTAINER_SHELL ?= "${@bb.utils.contains('PACKAGE_EXTRA_ARCHS', 'container-dummy-provides', 'container-dummy-provides', 'busybox', d)}"

# Allow build with or without specific kernel
IMAGE_CONTAINER_NO_DUMMY = "1"

ROOTFS_POSTPROCESS_COMMAND += "rootfs_fixup_var_volatile ;"
rootfs_fixup_var_volatile () {
    install -m 1777 -d ${IMAGE_ROOTFS}/${localstatedir}/volatile/tmp
    install -m 755 -d ${IMAGE_ROOTFS}/${localstatedir}/volatile/log
}

OCI_IMAGE_ENTRYPOINT = "curl"
OCI_IMAGE_TAG = "latest"
CONTAINER_SHELL = "busybox"

IMAGE_INSTALL:append = " curl"