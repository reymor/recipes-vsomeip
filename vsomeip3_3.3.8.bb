SUMMARY = "The vsomeip project is an open source implementation of SOME/IP"
SECTION = "libs"
LICENSE = "MPL-2.0"

LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

SRC_URI = "git://github.com/COVESA/vsomeip.git;branch=master;protocol=https"
SRCREV = "07464840f503670bc75997b8e926b54734ffa410"

S = "${WORKDIR}/git"

DEPENDS = "boost"

inherit cmake lib_package

BBCLASSEXTEND = "nativesdk"

do_install:append() {
    mv ${D}/usr/etc ${D}
}
