#!/bin/bash -x

present=1;

check=$(( RANDOM % 2 ));

if [ $present -eq $check ]
then
	echo "Employee is present";
else
	echo "Employee is not present"
fi
