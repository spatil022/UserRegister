

valid_inputs=(
"abc@yahoo.com"
"abc-100@yahoo.com"
"abc.100@yahoo.com"
"abc111@abc.com"
"abc-100@abc.net"
"abc.100@abc.com.au"
"abc@1.com"
"abc@gmail.com.com"
"abc+100@gmail.com"
)

invalid_inputs=(
"abc"
"abc@.com.my"
"abc123@gmail.a"
"abc123@.com"
"abc123@.com.com"
".abc@abc.com"
"abc()*@gmail.com"
"abc@%*.com"
"abc..2002@gmail.com"
"abc.@gmail.com"
"abc@abc@gmail.com"
"abc@gmail.com.1a"
"abc@gmail.com.aa.au"
)

regex="^([A-Za-z]+(\-|\.|\_|\+)?[A-Za-z0-9]*\+?((!.\-|\_)?[A-Za-z]+[A-Za-z0-9]*)*)@(([A-Za-z0-9]+)+((\.|\-|\_)?([A-Za-z0-9]+)+)*)+\.([A-Za-z]{2,})+$"

function validator {
  if [[ $1 =~ ${regex} ]]; then
    printf "* %-48s \e[1;32m[pass]\e[m\n" "${1}"
  else
    printf "* %-48s \e[1;31m[fail]\e[m\n" "${1}"
  fi
}

echo
echo "### expected result: valid"
echo

for input in "${valid_inputs[@]}"; do
  validator "${input}"
done

echo
echo "### expected result: invalid"
echo

for input in "${invalid_inputs[@]}"; do
  validator "${input}"
done
