#!/bin/bash -x

isPartTime=1;
isFullTime=2;
empRateperHr=20;

for ((counter=1;counter<=20;counter++))
do
		randomCheak=$(( RANDOM % 3 ));
			case $randomCheak in
					$isFullTime)
							empHr=8
							;;
					$isPartTime)
							empHr=4
							;;
					*)
							empHr=0
							;;
					esac
		salary=$(( empHr * empRateperHr ));
		totalsalary=$(( $totalsalary + $salary ));
done