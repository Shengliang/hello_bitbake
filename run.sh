#Update conf/bblayers.conf
#BBPATH=/scratch/ssl/bitbake/hello_bitbake
TOPDIR=/scratch/ssl/bitbake/hello_bitbake
#bitbake -c clean printhello
\rm -rf tmp
bitbake printhello
