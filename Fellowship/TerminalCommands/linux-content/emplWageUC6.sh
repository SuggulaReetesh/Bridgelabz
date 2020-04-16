#!/bin/bash -x

valid=true
isPartTime=1;
isFullTime=2;
empRateperHr=20;
Days=1;

while [ $valid ]
do
	randomCheak=$(( RANDOM % 3 ))
	if [ $Days -eq 20 ]
	then
			break;
	elif [ $totalHr -gt 100 ]
	then
			break;
	else
			(( Days++ ))
				Days=1;
			case $randomCheak in
					$isFullTime)
							empHr=8
							totalHr=$(($totalHr + $empHr))
							;;
					$isPartTime)
							empHr=4
							totalHr=$(($totalHr + $empHr))
							;;
					*)
							empHr=0
							totalHr=$(( $totalHr + $empHr ))
							;;
			esac
	fi
done

totalsalary=$(($totalHr * $empRateperHr))