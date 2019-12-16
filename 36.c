#include<stdio.h>
#include<math.h>
int a[8];
int n=4,count=0;
void nqueen(int k);

int main()
{
	nqueen(0);
	return 0;

}

void nqueen(int k)
{
	int i,j;
	if(k==n)
	{
		count++;
		printf("第%d种方案\n",count);
		for(i=0;i<=n-1;i++)
			printf("%d ",a[i]);
		printf("\n");
		return;
	}
	for(j=0;j<=n-1;j++)
	{
		for(i=0;i<=k-1;i++)
			if(a[i]==j||abs(j-a[i])==abs(i-k))
				break;
		if(i==k)
		{
			a[k]=j;
			nqueen(k+1);
		}
	}
}