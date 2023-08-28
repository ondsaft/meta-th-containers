SUMMARY = "TBA"
DESCRIPTION = "TBA"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ondsaft.c;beginline=1;endline=3;md5=0a18ee8c6cd0b4a58ff7c8686a53b33c"

SRC_URI = "file://ondsaft.c"
S = "${WORKDIR}"

do_compile() {
  ${CC} ${CFLAGS} ${LDFLAGS} -o ondsaft ondsaft.c
}

do_install() {
  install -d ${D}${bindir}
  install -m 0755 ondsaft ${D}${bindir}
}