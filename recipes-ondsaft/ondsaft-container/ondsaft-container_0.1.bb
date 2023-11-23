SUMMARY = "TBD"
DESCRIPTION = "TBD"
LICENSE = "MIT"

IMAGE_FSTYPES = "container oci"
inherit image
inherit image-oci

IMAGE_FEATURES = ""
IMAGE_LINGUAS = ""
NO_RECOMMENDATIONS = "1"

# Allow build with or without specific kernel
IMAGE_CONTAINER_NO_DUMMY = "1"

OCI_IMAGE_ENTRYPOINT = "ondsaft"
OCI_IMAGE_TAG = "latest"
CONTAINER_SHELL = "busybox"

IMAGE_INSTALL:append = " ondsaft"
#IMAGE_INSTALL:remove = "packagegroup-core-base-utils"
#IMAGE_INSTALL:append = " libc"