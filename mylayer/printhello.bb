DESCRIPTION = "Prints Hello World"
PN = 'printhello'
PV = '1'

python do_build() {
    bb.plain("********************");
    bb.plain("*                  *");
    bb.plain("*  Hello, World!   *");
    bb.plain("*                  *");
    bb.plain("********************");
}

python do_fetch() {
    bb.plain("do fetch ...");
}

addtask fetch before do_build

python do_unpack() {
    bb.plain("do unpack ...");
}

addtask unpack before do_build after do_fetch

python do_configure() {
    bb.plain("Configuring source package ...")
    # os.system("cd ${WORKDIR}/${P} && ./configure")
    bb.plain("Configured source package.")
}

addtask configure before do_build after do_unpack


python do_compile() {
    bb.plain("Compiling package...")
    # os.system("cd ${WORKDIR}/${P} && make")
    bb.plain("Compiled package.")
}

addtask compile before do_build after do_configure

do_clean[nostamp] = "1"
do_clean() {
    echo do clean
    # rm -rf ${TMPDIR}
}

addtask clean
