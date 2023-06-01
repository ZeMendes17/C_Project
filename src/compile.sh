# bash scipt to compile the desired file, precompiling it first

cd Precompiler/
echo "Creating Temporary file"
antlr4-run "../../examples/$1"
cd ../Compiler/
echo "Running Program"
#antlr4-run ../../examples/temp.da
java -ea dimanaMain ../../examples/temp.da $1
echo "Deleting Temporary file"
rm ../../examples/temp.da
echo "Closing..."